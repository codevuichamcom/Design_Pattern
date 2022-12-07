
# Problem

## Ví dụ Chain of Responsibility Pattern với ứng dụng Logger
## Trong ví dụ này, chúng ta sẽ tự xây dựng hệ thống Logger cho riêng mình như sau:
> - Logger: là một abstract class Handler, cho phép thực hiện một chain logger dựa vào giá trị LogLevel ứng với từng Handler. Nếu mức độ lỗi (severity) lớn hơn hoặc bằng với LogLevel mà nó có thể handle thì sẽ thực hiện writeMessage(), đồng thời gọi Hanlder kế tiếp nếu có.
> - ConsoleLogger, FileLogger, EmailLogger: đây là các ConcreteHandler, nó xác định LogLevel mà nó có thể xử lý, và cài đặt phương thức writeMessage() cho riêng nó.
> - Client : sử dụng Logger để ghi log.
> - LogLevel : là một enum (constant), dùng để xác định các mức độ ghi log.
> - AppLogger: là một lớp tiện ích, tạo chuỗi Handler để xử lý ghi log.
# Solution

![solution](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-chain-of-responsibility-example-logger-1.png)

# Details
[gpcoder chain of responsibility design pattern](https://gpcoder.com/4665-huong-dan-java-design-pattern-chain-of-responsibility/)<br>
 
# Folder structure
```
├── src (com.example.demo)
│   ├── client
│   │   └── App
│   ├── enums
│   │   └── LogLevel
│   ├── handler
│   |   ├── Logger(A)
│   |   ├── ConsoleLogger
│   |   ├── FileLogger
│   │   └── EmailLogger
│   ├── utils
│   │   └── AppLogger
├── .gitignore
└── README.md