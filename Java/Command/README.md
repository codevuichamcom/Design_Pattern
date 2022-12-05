# What is Observer design pattern
- Command dịch ra nghĩa là ra lệnh.
-  Commander nghĩa là chỉ huy, người này không làm mà chỉ ra lệnh cho người khác làm. 
-  Như vậy, phải có người nhận lệnh và thi hành lệnh. 
-  Người ra lệnh cần cung cấp một class đóng gói những mệnh lệnh.
-  Người nhận mệnh lệnh cần phân biệt những interface nào để thực hiện đúng mệnh lệnh.<br><br>
![image 1](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-command-diagram.png) 

# Problem
- Ứng dụng văn bản cần một chức năng để thêm hoặc lưu trữ những hành động undo hay redo.

# Solution
- Sử dụng Observer design pattern để giải quyết bài toán trên.<br><br>
![image 2](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-command-example2.png)

# Details
[gpcoder command design pattern](https://gpcoder.com/4686-huong-dan-java-design-pattern-command/)
 
# Folder structure
```
├── src (com.example.demo)
│   ├── observer
│   |   ├── Observer(I)
│   │   └── CharacterImpl
│   ├── subject
│   |   ├── Server(I)
│   │   └── CharacterImpl
│   ├── App
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