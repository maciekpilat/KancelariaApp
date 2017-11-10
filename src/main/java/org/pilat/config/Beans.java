/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.config;

import org.pilat.dao.EventDaoImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @author Pilat
 */

@EnableAsync
@Configuration
@ComponentScan({"org.pilat.dao"})
public class Beans {

    @Bean
        public EventDaoImplementation eventDaoBean() {
        return new EventDaoImplementation();
    }
}
