##Simple Android App with Clean Architecture

This is a sample of clean arhictecture with MVP pattern. This sample is clean without any third party libraries, so it is good for learning.

The sample of clean archictecture as follows

![Image](http://fernandocejas.com/wp-content/uploads/2014/09/clean_architecture1.png)

The core principle is the outer layer such as view should not know the inner layer.

For more detail, please visit references. 


## Common Best Practices
Of course, the sample is not ready for production use. We should use some third party libraries for the best performance such as

####1. Butterknife (http://jakewharton.github.io/butterknife/)
This is for view injection, so we don't have to initialize every view in the onCreate() method. It's easy and really awesome

####2. Retrofit (http://square.github.io/retrofit/)
I used AysncTask as a sample for the clean archictecture in order to make understand the concept of MVP first, but for the next development, it is better to use retrofit instead for networking.

####3. Dagger 2 (http://google.github.io/dagger/)
It is better to use depedency injection such as dagger 2 to inject some parts of the code such as the presenter, so the presenter lifecycle does not depend on the view. Dagger2 is also good for injecting the android api such as shared preference, content provider, to make the code much more cleaner.


##References
https://codelabs.developers.google.com/codelabs/android-testing/index.html
http://fernandocejas.com/2014/09/03/architecting-android-the-clean-way/
https://www.youtube.com/watch?v=4L7G1uaQ67s
http://www.thedroidsonroids.com/blog/android/example-realm-mvp-dagger/
