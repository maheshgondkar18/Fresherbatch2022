1-use mongo_practice
2-db.movies.insertOne({title:"Fight club",writer:"Chuck Palahniuko",Year:1999,actors:["Brad pitt","Edward Norton"]})
3-db.movies.insertMany([{title:"Pulp Fiction",writer:"Quentin Tarantino",Year:1994,actors:["John Travolta","Uma Thurman"]},{title:"Inglorious Basterds",writer:"Quentin Tarantino",Year:2009,actors:["Brad pitt","Diane Kruger","Eli Roth"]},{title:"The Hobbit: An Unexpected Journey",writer:"J.R.R Tolkein",Year:2012,franchise:"The Hobbit"},{title:"The Hobbit: The Desolation of Smaug",writer:"J.R.R Tolkein",Year:2013,franchise:"The Hobbit",synopsis:"Bilbo and Company are forced are to engage in a war against an array of combatants and keep the Lonely Mountain from falling into the hands of a rising darkness."},{title:"Pee Wee Herman's Big Adventure"},{title:"Avatar"}])
4-db.movies.find().pretty()
5-db.movies.find({writer:"Quentin Tarantino"}).pretty()
6-db.movies.find({actors:"brad pitt"}).pretty()
7-db.movies.find({franchise:"The Hobbit"}).pretty()
8-db.movies.find({$and:[{Year:{$gt:1900}},{Year:{$lt:2000}}]}).pretty()
9-db.movies.find({$or:[{Year:{$lt:2000}},{Year:{$gt:2010}}]}).pretty()
10-db.movies.updateOne({title:"The Hobbit: An Unexpected Journey"},{$set:{synopsis: "A reluctant hobbit, Bilbo Baggins, sets out to the Lonely Mountain with a spirited group of dwarves to reclaim their mountain home - and the gold within it - from the dragon Smaug."}})
11-db.movies.updateOne({title:"The Hobbit: The Desolation of Smaug"},{$set:{synopsis:"The dwarves, along with Bilbo Baggins and Gandalf the Grey, continue their quest to reclaim Erebor, their homeland, from Smaug. Bilbo Baggins is in possession of a mysterious and magical ring."}})
12-db.movies.updateOne({title:"Pulp Fiction"},{$push:{actors:"Samuel L. Jackson"}})
13-db.movies.createIndex({title:"text",writer:"text",franchise:"text",synopsis:"text"})// for create index first then we can search
14-db.movies.find({$text:{$search:"Biblo"}})
15-db.movies.find({$text: {$search: "Gandalf"}})
16-db.movies.find({$text: {$search: "Bilbo -Gandalf"}})
17-db.movies.find({$text: {$search: "dwarves hobbit"}})
18-db.movies.find({$text: {$search: "gold dragon"}})
19-db.movies.remove({title: "Pee Wee Herman's Big Adventure"})
20-db.movies.remove({title: "Avatar"})
21-db.users.insertMany([{username:"GoodGuyGreg",first_name:"Good Guy",last_name:"Greg"},{username:"ScumbagSteve",full_name:"",first:"Scumbag",last:"Steve"}])
22-db.posts.insertMany([{username : "GoodGuyGreg", title : "Passes out at party", body : "Wakes up early and cleans house"},{username : "GoodGuyGreg", title : "Steals your identity", body : "Raises your credit score"},{username : "GoodGuyGreg", title : "Reports a bug in your code", body : "Sends you a Pull Request"},{username : "ScumbagSteve", title : "Borrows something", body : "Sells it"},{username : "ScumbagSteve", title : "Borrows everything", body : "The end"},{username : "ScumbagSteve", title : "Forks your repo on github" ,body :"Sets to private"}])
23-db.comments.insertMany([{username : "GoodGuyGreg",comment : "Hope you got a good deal!",post :"61e5c67bc04247c55c3dff83"},{username : "GoodGuyGreg",comment : "What's mine is yours!",post : "61e5c67bc04247c55c3dff84"},{username : "GoodGuyGreg",comment : "Don't violate the licensing agreement!",post : "61e5c67bc04247c55c3dff85"},{username : "ScumbagSteve",comment : "It still isn't clean",post : "61e5c67bc04247c55c3dff80"},{username : "ScumbagSteve",comment : "Denied your PR cause I found a hack",post : "61e5c67bc04247c55c3dff82"}])

24-db.users.find().pretty()
25-b.posts.find().pretty
26-db.posts.find({username:"GoodGuyGreg"}).pretty()
27-db.posts.find({username: "ScumbagSteve"}).pretty()
28-db.comments.find().pretty()
29-db.comments.find({username: "GoodGuyGreg"})
30-db.comments.find({username: "ScumbagSteve"})
31-db.comments.find({post :"61e5c67bc04247c55c3dff82"}).pretty

2nd Assignment
32-db.zipcodes.aggregate([{$match:{city:"ATLANTA",state:"GA"}}]).pretty()
33-population of ATLANTA
db.zipcodes.aggregate( [
    {$match:{city:"ATLANTA"}},
   { $group: { _id: { city: "$city"}, pop: { $sum: "$pop" } } }
] )

34-calculate population of each state
db.zipcodes.aggregate( [
    { $group: { _id: { state: "$state"}, pop: { $sum: "$pop" } } }
 ] )

 35- sorting of each State by highest population first
 db.zipcodes.aggregate( [
    { $group: { _id: { state: "$state"}, pop: { $sum: "$pop" } } },
    {$sort:{pop:-1}} 
 ] )

 36-limit result for 1st 3
 db.zipcodes.aggregate( [
    { $group: { _id: { state: "$state"}, pop: { $sum: "$pop" } } },
    {$sort:{pop:-1}},
    {$limit:3}
 ] )

 37-total population of each city and sort by hightest to limit=3
 db.zipcodes.aggregate( [
    { $group: { _id: {city:"$city",state: "$state"},pop: { $sum: "$pop" } } },
    {$sort:{pop:-1}},
    {$limit:3}
 ] )

 3rd Assignment

38-to find name,id,borough,cuisin in restaurant collection 
db.resturant.find()

39-db.restaurants.find({resturant_id:1,name:1,borough:1,cuisine:1})
40-query to display first 5 restaurants in borough Bronx
db.restaurants.aggregate([
    {$match:{borough:"Bronx"}},
    {$limit:5}
        ])

41-all resturants in Bronx
db.restaurants.aggregate([
    {$match:{borough:"Bronx"}}
        ])

42-next 5 after skipping the first 5
db.restaurants.aggregate([
    {$match:{borough:"Bronx"}},
    {$skip:5}
        ])

43-score more than 80 but less than 100
db.restaurants.find(
    {grades : 
        { $elemMatch:
            {"score":{$gt : 80 , $lt :100}
        }
    }});

44-lattitude value less than 95
db.restaurants.find(
    {"address.coord" : {$lt : -95.754168}
});

45-does not prepare American food and reside 70 lattitude and achived score more than 70
db.restaurants.find(
    {$and:
         [
            {"cuisine" : {$ne :"American "}},
            {"grades.score" : {$gt : 70}},
            {"address.coord" : {$lt : -65.754168}}
         ]
     }
         );
        
46-does not prepare American food and reside -65 lattitude and achived score more than 70
db.restaurants.find(
    {
      "cuisine" : {$ne : "American "},
      "grades.score" :{$gt: 70},
      "address.coord" : {$lt : -65.754168}
     }
);

47-does not prepare american does not reside in brooklyn achived grade A and  must be descending order
db.restaurants.find( {
    "cuisine" : {$ne : "American "},
    "grades.grade" :"A",
    "borough": {$ne : "Brooklyn"}
} 
).sort({"cuisine":-1});

48-find res_id,name,cuisine,borough of those restaurant which contain 'Wil' as their first 3 letters
db.restaurants.find(
    {name: /^Wil/},
    {
    "restaurant_id" : 1,
    "name":1,"borough":1,
    "cuisine" :1
    }
    );
49-find res_id,name,cuisine,borough of those restaurant which contain 'ces' as their last 3 letters
db.restaurants.find(
    {name: /ces$/},
    {
    "restaurant_id" : 1,
    "name":1,"borough":1,
    "cuisine" :1
    }
    );
50-belonged to borough bronx prepared either american or chinese
db.restaurants.find(
    { 
    "borough": "Bronx" , 
    $or : [
    { "cuisine" : "American " },
    { "cuisine" : "Chinese" }
    ] 
    } 
    );
51-resturant rside in staten island,queens,brooklyn
db.restaurants.find(
    {"borough" :{$in :["Staten Island","Queens","Bronx","Brooklyn"]}},
    {
    "restaurant_id" : 1,
    "name":1,"borough":1,
    "cuisine" :1
    }
    );
52-restaurant does not belong to staten Island,queens,Bronx,Brroklyn
db.restaurants.find(
    {"borough" :{$nin :["Staten Island","Queens","Bronx","Brooklyn"]}},
    {
    "restaurant_id" : 1,
    "name":1,"borough":1,
    "cuisine" :1
    }
    );

53- restaurant Id, name, borough and cuisine for those restaurants which achieved a score which is not more than 10
db.restaurants.find(
    {"grades.score" : 
    { $not: 
    {$gt : 10}
    }
    },
    {
    "restaurant_id" : 1,
    "name":1,"borough":1,
    "cuisine" :1
    }
    );
54-those restaurants which prepared dish except 'American' and 'Chinees' or restaurant's name begins with letter 'Wil'.
db.restaurants.find(
    {$or: [
      {name: /^Wil/}, 
      {"$and": [
           {"cuisine" : {$ne :"American "}}, 
           {"cuisine" : {$ne :"Chinees"}}
       ]}
    ]}
    ,{"restaurant_id" : 1,"name":1,"borough":1,"cuisine" :1}
    );
55-achieved a grade of "A" and scored 11 on an ISODate "2014-08-11T00:00:00Z" among many of survey dates.
db.restaurants.find( 
    {
     "grades.date": ISODate("2014-08-11T00:00:00Z"), 
     "grades.grade":"A" , 
     "grades.score" : 11
    }, 
    {"restaurant_id" : 1,"name":1,"grades":1}
 );

 56-contains a grade of A and score 9 on a specific date
 db.restaurants.find( 
    { "grades.1.date": ISODate("2014-08-11T00:00:00Z"), 
      "grades.1.grade":"A" , 
      "grades.1.score" : 9
    }, 
     {"restaurant_id" : 1,"name":1,"grades":1}
 );

 57-location of the restaurants where 2nd element contains a value between 42 and 52
 db.restaurants.find( 
    { 
      "address.coord.1": {$gt : 42, $lte : 52}
    },
      {"restaurant_id" : 1,"name":1,"address":1,"coord":1}
 );

 58- restaurants in ascending order along with all the columns
 db.restaurants.find().sort({"name":1});

 59-in ascending order and for that same cuisine borough should be in descending order
 db.restaurants.find().sort(
    {"cuisine":1,"borough" : -1,}
   );

60-Test whether all the addresses contains the street or not
db.restaurants.find(
    {"address.street" : 
        { $exists : true } 
    } 
  );

61-he restaurants collection where the coord field value is double
db.restaurants.find(
    {"address.coord" : 
       {$type : 1}
    }
   );

62-restaurants which returns 0 as a remainder after dividing the score by 7
db.restaurants.find(
    {"grades.score" :
       {$mod : [7,0]}
    },
       {"restaurant_id" : 1,"name":1,"grades":1}
  );
63-restaurants which contains 'mon' as three letters somewhere in its name.
db.restaurants.find(
    { name : 
      { $regex : "mon.*", $options: "i" } 
    },
        {
          "name":1,
          "borough":1,
          "address.coord":1,
          "cuisine" :1
         }
    );

64- restaurants which contain Mad as first three letters of its name
db.restaurants.find(
    { name : 
      { $regex : /^Mad/i, } 
    },
        {
          "name":1,
          "borough":1,
          "address.coord":1,
          "cuisine" :1
         }
    );




