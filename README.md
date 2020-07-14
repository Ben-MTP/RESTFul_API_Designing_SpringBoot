# RESTFul_API_Designing_SpringBoot
* Huong dan tao moi nhung chuc nang Them, xoa, sua, update du lieu cho mot Employee:
	- Dùng trên map
	- Dùng kết nối trên cơ sở dữ liệu

* Dùng Database: MySQL
-------12/07/2020---------
* Cấu hình kết nối đến Database: 
* Database config:
Bước 1: Cấu hình thông tin kết nối đến Database MySQL: trong file src/main/resource -> application.properties (is file chứa mọi loại cấu hình trong dự án, như port kết nối, thông tin Database)
- spring.datasource.driver-class-name: com.mysql.jdbc.Driver
- spring.datasource.url
- spring.database.username
- spring.database.password


-------JPA / HIBERNATE------
spring.jpa.show-sql
spring.jpa.hibernate.ddl-auto
spring.jpa.properties.hibernate.dialect
spring.jpa.properties.hibernate.current_session_context_class
