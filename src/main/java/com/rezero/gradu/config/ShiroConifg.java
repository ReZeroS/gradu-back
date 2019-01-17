package com.rezero.gradu.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConifg {
//
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        // 设置securityManager
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        // 登录的url
//        shiroFilterFactoryBean.setLoginUrl("/login");
//        // 登录成功后跳转的url
//        shiroFilterFactoryBean.setSuccessUrl("/index");
//        // 未授权url
//        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
//
//        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//
//        // 定义filterChain，静态资源不拦截
//        filterChainDefinitionMap.put("/css/**", "anon");
//        filterChainDefinitionMap.put("/js/**", "anon");
//        filterChainDefinitionMap.put("/fonts/**", "anon");
//        filterChainDefinitionMap.put("/img/**", "anon");
//        // druid数据源监控页面不拦截
//        filterChainDefinitionMap.put("/druid/**", "anon");
//        // 配置退出过滤器，其中具体的退出代码Shiro已经替我们实现了
//        filterChainDefinitionMap.put("/logout", "logout");
//        filterChainDefinitionMap.put("/", "anon");
//        // 除上以外所有url都必须认证通过才可以访问，未通过认证自动访问LoginUrl
//        filterChainDefinitionMap.put("/**", "authc");
//
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        return shiroFilterFactoryBean;
//    }
//
//    @Bean
//    public DefaultWebSecurityManager securityManager(){
//        // 配置SecurityManager，并注入shiroRealm
//        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
//        securityManager.setRealm(shiroRealm());
//        return securityManager;
//    }
//
//    @Bean(name = "lifecycleBeanPostProcessor")
//    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//        // Shiro生命周期处理器
//        return new LifecycleBeanPostProcessor();
//    }
//
//    @Bean
//    public ShiroRealm shiroRealm(){
//        // 配置Realm，需自己实现
//        ShiroRealm shiroRealm = new ShiroRealm();
//        return shiroRealm;
//    }
//

}
