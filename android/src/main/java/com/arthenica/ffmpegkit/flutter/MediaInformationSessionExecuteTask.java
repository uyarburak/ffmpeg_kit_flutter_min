/*
 * Copyright (c) 2021 Taner Sener
 *
 * This file is part of FFmpegKit.
 *
 * FFmpegKit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FFmpegKit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FFmpegKit.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.arthenica.ffmpegkit.flutter;

import androidx.annotation.NonNull;
import androidx.annotation.Keep;

import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.MediaInformationSession;

import io.flutter.plugin.common.MethodChannel;

@Keep
public class MediaInformationSessionExecuteTask implements Runnable {
    private final MediaInformationSession mediaInformationSession;
    private final int timeout;
    private final FFmpegKitFlutterMethodResultHandler resultHandler;
    private final MethodChannel.Result result;

    public MediaInformationSessionExecuteTask(@NonNull final MediaInformationSession mediaInformationSession, final int timeout, @NonNull final FFmpegKitFlutterMethodResultHandler resultHandler, @NonNull final MethodChannel.Result result) {
        this.mediaInformationSession = mediaInformationSession;
        this.timeout = timeout;
        this.resultHandler = resultHandler;
        this.result = result;
    }

    @Override
    public void run() {
        FFmpegKitConfig.getMediaInformationExecute(mediaInformationSession, timeout);
        resultHandler.successAsync(result, null);
    }
}
