package com.qiniucloud.upload.service;

import com.qiniucloud.upload.config.CloudStorageConfig;

import java.io.InputStream;

public abstract  class UploadImageService {
    protected CloudStorageConfig config;

    public abstract String uploadQNImg(InputStream file, String path);
}
