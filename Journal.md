# Journal

Phase 1
I used a common interface to create a remote proxy that can call the methods of the RealMedia object after it establishes
a connection. Since both classes implement the same interface you can call the interface in the proxy's constructor
then pass the RealMedia object into that constructor to connect the two and use the media object's methods.

Phase 2
I created a virtual proxy for creating a real media object only after it's methods are called. The remote proxy passes
the real media object from a different machine to the client, but the virtual proxy loads or creates the object after 
the client requests it and delegates method calls to the real media object. I did have trouble figuring out how I was 
going to create the instance of the media object in the virtual proxy class, until I found out that I should create a 
private method for that.

Phase 3 
An edge case I found for the virtual proxy is that the object can stay in memory after it is created, which would defeat
the purpose of the proxy. The program needs to check if the object is not being used anymore or use a stop playing method
to set the object back to null so that it doesn't use more resources than necessary.
