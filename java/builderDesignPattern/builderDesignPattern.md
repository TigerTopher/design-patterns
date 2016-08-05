Builder Design Pattern
---

* Pattern used to create objects made from a bunch of other objects
    * When you want to build an object made up from other object
    * When you want the creation of these parts to be independent of the main object
    * Hide the creation of the parts from the client so both aren't dependent
    * The builder knows the specifics and nobody else does

Builder vs Factory
---
* A factory is simply a wrapper function around a constructor (possibly one in a different class). The key difference is that a factory method pattern requires the entire object to be built in a single method call, with all the parameters pass in on a single line. The final object will be returned.

* A builder pattern, on the other hand, is in essence a wrapper object around all the possible parameters you might want to pass into a constructor invocation. This allows you to use setter methods to slowly build up your parameter list. One additional method on a builder class is a build() method, which simply passes the builder object into the desired constructor, and returns the result.

* In static languages like Java, this becomes more important when you have more than a handful of (potentially optional) parameters, as it avoids the requirement to have telescopic constructors for all the possible combinations of parameters. Also a builder allows you to use setter methods to define read-only or private fields that cannot be directly modified after the constructor has been called.

Content
---
* [builder-001] Builder Design Pattern Video - Derek Banas
* [builder-002] The Builder Pattern in Practice - Jose Luis Ordiales

Sources
---
* [builder-001] https://www.youtube.com/watch?v=9XnsOpjclUg
* [builder-002] https://jlordiales.me/2012/12/13/the-builder-pattern-in-practice/
* [Builder vs Factory] http://stackoverflow.com/questions/757743/what-is-the-difference-between-builder-design-pattern-and-factory-design-pattern
