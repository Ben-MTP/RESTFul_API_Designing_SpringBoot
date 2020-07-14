# RESTFul_API_Designing_SpringBoot
* Huong dan tao moi nhung chuc nang Them, xoa, sua, update du lieu cho mot Employee:
	- Dùng trên map
	- Dùng kết nối trên cơ sở dữ liệu

* Dùng Database: MySQL
-------12/07/2020---------
* Cấu hình kết nối đến Database: 
* Database config:
- Bước 1: Cấu hình thông tin kết nối đến Database MySQL: trong file src/main/resource -> application.properties (is file chứa mọi loại cấu hình trong dự án, như port kết nối, thông tin Database)
- spring.datasource.driver-class-name: com.mysql.jdbc.Driver
- spring.datasource.url
- spring.database.username
- spring.database.password


-------JPA / HIBERNATE------
spring.jpa.show-sql
spring.jpa.hibernate.ddl-auto
spring.jpa.properties.hibernate.dialect
spring.jpa.properties.hibernate.current_session_context_class

* Tạo CRUD với RESTful API với Spring Boot và MySQL, Hibernate:

#------Bài 26----
Cấu hình sao cho project có thể loading được hibernate lên
Hibernate thực chất là một framwork hỗ trợ cho việc làm việc với Database dễ dàng và thuận tiện hơn.
- Nội dung 1:
	Cấu hình code sao cho ứng dụng load lên để sử dụng:
	Mọi thứ được đọc lại trong file: HibernateConfig.java
	Chỉ ra các package loading các intity của prject:
	
- Nội dung 1:
	Add thêm một vài annotation vào file: DemoApplication.java
- Kết thúc bài 26: Hỗ trợ cấu hình có thể kết nối đến Database của MySQL một cách thành công, cấu hình khá nhiều Annotation trong project.

#------Bài 27-----
- Cách mapping một class Entities đến một table, những trường thuộc database
- Mục đích map sao cho các trường của một thực thế trong project nhận tương ứng với các trường trong Database.
- cần thêm 2 annotation: @Entities và @Table
- Những annotation biểu diễn trên các cột
- Hibernate sẽ làm việc như một ORM framework thôi, không có gì cả


#------Bai 28------
- Nội dung tập trung về các phần code của các layer như DAO, Service, REST controler.
- @Repository
- Nhúng session factory -> session


#-----Bai 29 -----
- Test chức năng CURD trên ứng dụng




