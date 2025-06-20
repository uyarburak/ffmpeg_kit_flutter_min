# Keep smartexception classes
-keep class com.arthenica.smartexception.** { *; }
-keep class com.arthenica.smartexception.java.** { *; }
-keep class com.arthenica.smartexception.java.Exceptions { *; }

# Keep FFmpeg Kit classes
-keep class com.arthenica.ffmpegkit.** { *; }
-keep class com.arthenica.ffmpegkit.flutter.** { *; }

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep classes with @Keep annotation
-keep class * {
    @androidx.annotation.Keep *;
} 