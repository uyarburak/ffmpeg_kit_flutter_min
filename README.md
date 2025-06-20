# Custom FFmpeg Kit Flutter

This is a custom build of FFmpeg Kit for Flutter that uses locally built binaries instead of the official hosted packages.

## Features

- ✅ Custom built FFmpeg Kit binaries
- ✅ Android support (min package)
- ✅ iOS support
- ❌ macOS support (not currently available)
- ✅ No dependency on external hosting services

## Installation

Add this package to your `pubspec.yaml`:

```yaml
dependencies:
  ffmpeg_kit_flutter_min:
    git:
      url: https://github.com/uyarburak/ffmpeg_kit_flutter_min.git
      ref: main
```

## Usage

Import and use the package just like the original FFmpeg Kit:

```dart
import 'package:ffmpeg_kit_flutter_min/ffmpeg_kit.dart';

// Your FFmpeg commands here
await FFmpegKit.execute('-i input.mp4 -c:v libx264 output.mp4');
```

## Build Information

- **FFmpeg Version**: 6.0
- **Package Type**: min (basic functionality)
- **Android API Level**: 24+
- **iOS Deployment Target**: 12.1+

## License

This package is licensed under LGPL 3.0.

## Building Your Own

To build your own custom FFmpeg Kit binaries:

1. Clone the FFmpeg Kit repository
2. Set up Android SDK and NDK
3. Run: `./android.sh` (for Android min package)
4. Run: `./ios.sh` (for iOS min package)
5. Copy the built binaries to this package

## Support

This is a custom build. For issues related to FFmpeg Kit functionality, refer to the original FFmpeg Kit documentation.
