package com.ufsc.trabalho2.services;

import com.ufsc.trabalho2.repositories.AssuntoRepository;
import java.lang.reflect.Field;
import org.springframework.aot.beans.factory.BeanDefinitionRegistrar;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.ReflectionUtils;

public final class Trabalho2ApplicationTestsContextInitializer {
  public static void registerAssuntoService(DefaultListableBeanFactory beanFactory) {
    BeanDefinitionRegistrar.of("assuntoService", AssuntoService.class)
        .instanceSupplier((instanceContext) -> {
          AssuntoService bean = new AssuntoService();
          instanceContext.field("AssuntoRepository", AssuntoRepository.class)
              .invoke(beanFactory, (attributes) -> {
                Field AssuntoRepositoryField = ReflectionUtils.findField(AssuntoService.class, "AssuntoRepository", AssuntoRepository.class);
                ReflectionUtils.makeAccessible(AssuntoRepositoryField);
                ReflectionUtils.setField(AssuntoRepositoryField, bean, attributes.get(0));
              });
                  return bean;
                }).register(beanFactory);
          }
        }
