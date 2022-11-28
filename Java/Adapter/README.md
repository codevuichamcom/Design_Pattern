# What is Adapter design pattern
Adapter Pattern giữ vai trò trung gian giữa hai lớp, chuyển đổi interface của một hay nhiều lớp có sẵn thành một interface khác, thích hợp cho lớp đang viết. <br>
![Adapter example 1](https://gpcoder.com/wp-content/uploads/2018/10/adapter-pattern-example.jpg) 
### Adapter example 1 <br><br>
![Adapter example 2](https://gpcoder.com/wp-content/uploads/2018/10/adapter-1.jpg)
### Adapter example 2 <br><br>
![Adapter example 3](https://gpcoder.com/wp-content/uploads/2018/10/adapter-laptop.jpeg)
### Adapter example 3 <br><br>

# Problem
- Một người Việt muốn trao đổi với một người Nhật. 
- Tuy nhiên, 2 người này không biết ngôn ngữ của nhau nên cần phải có một người để chuyển đổi từ ngôn ngữ tiếng Việt sang ngôn ngữ tiếng Nhật. 
- Chúng ta sẽ mô hình hóa trường hợp này với Adapter Pattern như sau:
  > - Client: người Việt sẽ là Client trong ví dụ này,vì anh ta cần gửi một số message cho người Nhật.
  > - Target: đây là nội dung message được Client cung cấp cho thông dịch viên (Translator / Adapter).
  > - Adapter: thông dịch viên (Translator) sẽ là Adapter, nhận message tiếng Việt từ Client và chuyển đổi nó sang tiếng Nhật trước khi gởi cho người Nhật.
  > - Adaptee: đây là interface hoặc class được người Nhật sử dụng để nhận message được chuyển đổi từ thông dịch viên (Translator).

# Solution

Sử dụng Adapter design pattern để giải quyết bài toán trên.
![solution](https://gpcoder.com/wp-content/uploads/2018/10/design-patterns-adapter-diagram-translator-example.png)
 
# Folder structure
```
├── src (com.example.demo)
│   ├── client
│   │   └── App
│   ├── target
│   │   └── VietnameseTarget
│   ├── adapter
│   │   └── TranslatorAdapter
│   ├── adaptee
│   │   └── JapaneseAdaptee
│   ├── utils
│   │   └── NetworkLatencyFaker
├── .gitignore
└── README.md
```
<style>
    img {
        display: block;
        margin:0 auto;
        width:500px;
    }
    h2, h3{
        text-align:center;
    }
</style>