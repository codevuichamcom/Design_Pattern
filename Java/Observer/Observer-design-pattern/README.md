# What is Observer design pattern
- Nó định nghĩa mối phụ thuộc một – nhiều giữa các đối tượng để khi mà một đối tượng có sự thay đổi trạng thái,
- tất các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động.
![Observer example 1](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-observer-example-1.png) 
### Observer example 1 <br><br>
![Observer example 2](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-observer-diagram.png) 
### Observer example 2 <br><br>

# Problem
- Tạo 1 game tương tự như Liên Minh Huyền Thoại
- Game gồm các nhân vật (Jinx, Garen,...)
- Khi 1 nhân vật thực hiện Ping thì các nhân vật kia sẽ đều thấy thông báo hiển thị

# Solution

Sử dụng Observer design pattern để giải quyết bài toán trên.

# Details
[gpcoder observer design pattern](https://gpcoder.com/4747-huong-dan-java-design-pattern-observer/)
 
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