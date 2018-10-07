CREATE DATABASE wxsperp
     CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;
    
CREATE USER 'wxsperp'@'%' IDENTIFIED BY 'wxsperp';

GRANT ALL PRIVILEGES ON wxsperp.* TO 'wxsperp'@'%'   WITH GRANT OPTION;