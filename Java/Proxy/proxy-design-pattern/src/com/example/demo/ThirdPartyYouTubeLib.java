package com.example.demo;

import java.util.HashMap;

import com.example.demo.models.Video;

public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}
