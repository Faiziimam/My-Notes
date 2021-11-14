## Connection
```javascript
const moongoose = require('mongoose');

// This will connect out database--->host/databaseName
moongoose.connect('mongodb://localhost:27017/fruitsDB', {
  useNewUrlParser: true,
});
```
## Insertion 
```javascript
const personSchema = new moongoose.Schema({
  name: String,
  age: Number,
});

const Person = moongoose.model('Person', personSchema);

const person = new Person({
  name: 'Faiz',
  age: 19,
});
person.save();
```

## Multiple Insertion
```javascript 
const fruitSchema = new moongoose.Schema({
  name: String,
  rating: Number,
  review: String,
});
//  2) Model
const Fruit = moongoose.model('Fruit', fruitSchema);
// 3) Inserting values
const fruit = new Fruit({
  name: 'Apple',
  rating: 4,
  review: 'Nice Fruit',
});

const kiwi = new Fruit({
  name: '-iwi',
  rating: 10,
  review: 'Good',
});
const banana = new Fruit({
  name: 'Kiwi',
  rating: 10,
  review: 'Good',
});
const pineapple = new Fruit({
  name: 'Kiwi',
  rating: 10,
  review: 'Good',
});
Fruit.insertMany([kiwi, banana, pineapple], function (err) {
  if (err) {
    console.log(err);
  } else console.log('Successfully Inserted');
});
```
