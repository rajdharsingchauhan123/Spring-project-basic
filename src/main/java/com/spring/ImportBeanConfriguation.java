package com.spring;

import com.spring.config.Appconfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import( Appconfig.class)

public class ImportBeanConfriguation {


}
