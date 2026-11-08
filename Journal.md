# Journal

Phase 1
I used a common interface to create a remote proxy that can call the methods of the RealMedia object after it establishes
a connection. Since both classes implement the same interface you can call the interface in the proxy's constructor
then pass the RealMedia object into that constructor to connect the two and use the media object's methods.
