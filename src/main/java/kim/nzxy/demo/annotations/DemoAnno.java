package kim.nzxy.demo.annotations;

/**
 * 示例自定义注解
 * @author ly-chn
 */
public @interface DemoAnno {
    /**
     * @return 此值需要SpEL表达式支持
     */
    String spelValue() default "";

    /**
     * @return 此值为SpEL表达式, 但是使用模板
     */
    String spelTemplateValue() default "";

    /**
     * @return 此值为普通字符串
     */
    String normalValue() default "";
}
