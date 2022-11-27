# Problem
- So sánh việc render video youtube khi sử dụng `Cache` và không sử dụng `Cache`.
- Bao gồm render các video phổ biến và 1 vài video cụ thể (Theo id).
- Giả lập việc render thực tế sẽ chiếm nhiều thời gian (high latency)

# Solution

Sử dụng Proxy design pattern để cache

# Folder structure
```
├── src
│   ├── App
│   ├── ThirdPartyYouTubeLib
│   ├── models
│   │   ├── Video
│   │   └── ThirdPartyYouTubeLibImpl
│   ├── proxy
│   │   └── YouTubeCacheProxy
│   ├── downloader
│   │   └── YouTubeDownloader
└── README.md
```