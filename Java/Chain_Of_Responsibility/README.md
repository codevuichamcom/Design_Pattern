# What is Chain of responsibility design pattern
- Chain of Responsiblity cho phép một đối tượng gửi một yêu cầu nhưng không biết đối tượng nào sẽ nhận và xử lý nó. 
- Điều này được thực hiện bằng cách kết nối các đối tượng nhận yêu cầu thành một chuỗi (chain) và gửi yêu cầu theo chuỗi đó cho đến khi có một đối tượng xử lý nó.
![image](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-chain-of-responsibility-example-1.png)
- Chain of Responsibility Pattern hoạt động như một danh sách liên kết (Linked list) với việc đệ quy duyệt qua các phần tử (recursive traversal).

# Diagram
![diagram](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-chain-of-responsibility-diagram.png)