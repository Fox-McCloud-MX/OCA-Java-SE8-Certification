# Static Interface Methods
A static method defi ned in an interface is not inherited in any classes that implement the interface.

Here are the static interface method rules you need to be familiar with:
1. Like all methods in an interface, a static method is assumed to be public and will not compile if marked as private or protected.
2. To reference the static method, a reference to the name of the interface must be used.