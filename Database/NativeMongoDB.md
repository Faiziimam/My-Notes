# Boiler Plate

```javascript
const MongoClient = require('mongodb').MongoClient;
const assert = require('assert');

// Connection URL
const url = 'mongodb://localhost:27017';

// Database Name
const dbName = 'fruitsDB';
const client = new MongoClient(url, { useNewUrlParser: true });

// Use connect method to connect to the server
client.connect(function (err) {
  assert.equal(null, err);
  console.log('Connected successfully to server');

  const db = client.db(dbName);

  insertDocuments(db, function () {
    findDocuments(db, function () {
      client.close();
    });
  });
});
const insertDocuments = function (db, callback) {
  // Get the documents collection
  const collection = db.collection('fruits');
  // Insert some documents
  collection.insertMany(
    [
      {
        name: 'Apple',
        price: 14,
        review: 'Very Nice Fruit',
      },
      {
        name: 'Banana',
        price: 14,
        review: 'Very Nice Fruit',
      },
      {
        name: 'Strawberry',
        price: 14,
        review: 'Very Nice Fruit',
      },
    ],
    function (err, result) {
      assert.equal(err, null);
      assert.equal(3, result.insertedCount);
      assert.equal(3, Object.keys(result.insertedIds).length);
      console.log('Inserted 3 documents into the collection');
      callback(result);
    }
  );
};
// To Find
const findDocuments = function (db, callback) {
  // Get the documents collection
  const collection = db.collection('fruits');
  // Find some documents
  collection.find({}).toArray(function (err, fruits) {
    assert.equal(err, null);
    console.log('Found the following records');
    console.log(fruits);
    callback(fruits);
  });
};

```
