package com.zhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableWebSecurity   //启用security安全框架的安全校验
public class AuthConfig extends WebSecurityConfigurerAdapter {

        //在方法中配置用户名和密码，作为用户登录的数据
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            PasswordEncoder pe = passwordEncoder();
            auth.inMemoryAuthentication().withUser("admin").password(pe.encode("admin")).roles();
            auth.inMemoryAuthentication().withUser("lisi").password(pe.encode("admin")).roles();
            auth.inMemoryAuthentication().withUser("王五").password(pe.encode("admin")).roles();
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
            // 通过passwordEncoder的实现类，实现加密算法
            return new BCryptPasswordEncoder();
        }
}
