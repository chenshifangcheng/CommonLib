[![Jitpack](https://jitpack.io/v/chenshifangcheng/CommonLib.svg)](https://jitpack.io/#chenshifangcheng/CommonLib)

## CommonLib
Common library to make develop Android app easier

## Dependency
Add this in your root build.gradle at the end of repositories:

``` groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add the library to your module build.gradle file:
``` groovy
dependencies {
    ...
    implementation 'com.github.chenshifangcheng:CommonLib:v1.1'
}
```

Enable the debug log
```
adb shell setprop log.tag.CommonLibLog D
```