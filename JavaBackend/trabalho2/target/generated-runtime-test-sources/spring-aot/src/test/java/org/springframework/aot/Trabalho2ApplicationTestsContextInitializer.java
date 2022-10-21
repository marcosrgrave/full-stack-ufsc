package org.springframework.aot;

import com.ufsc.trabalho2.Trabalho2Application;
import com.ufsc.trabalho2.entities.AssuntoEntity;
import com.ufsc.trabalho2.entities.ComentarioEntity;
import com.ufsc.trabalho2.entities.EditorEntity;
import com.ufsc.trabalho2.entities.PostagemEntity;
import com.ufsc.trabalho2.repositories.AssuntoRepository;
import com.ufsc.trabalho2.repositories.ComentarioRepository;
import com.ufsc.trabalho2.repositories.EditorRepository;
import com.ufsc.trabalho2.repositories.PostagemRepository;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aot.beans.factory.BeanDefinitionRegistrar;
import org.springframework.aot.context.annotation.ImportAwareBeanPostProcessor;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.boot.autoconfigure.context.LifecycleProperties;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.boot.autoconfigure.transaction.TransactionProperties;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.availability.ApplicationAvailabilityBean;
import org.springframework.boot.context.properties.BoundConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.boot.task.TaskSchedulerBuilder;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.DefaultLifecycleProcessor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;
import org.springframework.data.jpa.repository.support.DefaultJpaContext;
import org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor;
import org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.PropertiesBasedNamedQueries;
import org.springframework.data.repository.core.support.RepositoryFragmentsFactoryBean;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.SharedEntityManagerCreator;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration;
import org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration;
import org.springframework.transaction.event.TransactionalEventListenerFactory;
import org.springframework.transaction.interceptor.BeanFactoryTransactionAttributeSourceAdvisor;
import org.springframework.transaction.interceptor.TransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * AOT generated context for {@code Trabalho2ApplicationTests}.
 */
public class Trabalho2ApplicationTestsContextInitializer implements ApplicationContextInitializer<GenericApplicationContext> {
  private ImportAwareBeanPostProcessor createImportAwareBeanPostProcessor() {
    Map<String, String> mappings = new LinkedHashMap<>();
    mappings.put("org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration", "org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$JdkDynamicAutoProxyConfiguration");
    return new ImportAwareBeanPostProcessor(mappings);
  }

  @Override
  public void initialize(GenericApplicationContext context) {
    // infrastructure
    DefaultListableBeanFactory beanFactory = context.getDefaultListableBeanFactory();
    beanFactory.setAutowireCandidateResolver(new ContextAnnotationAutowireCandidateResolver());
    beanFactory.addBeanPostProcessor(createImportAwareBeanPostProcessor());

    BeanDefinitionRegistrar.of("org.springframework.context.annotation.internalPersistenceAnnotationProcessor", PersistenceAnnotationBeanPostProcessor.class)
        .instanceSupplier(PersistenceAnnotationBeanPostProcessor::new).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("trabalho2Application", Trabalho2Application.class)
        .instanceSupplier(Trabalho2Application::new).register(beanFactory);
    com.ufsc.trabalho2.services.Trabalho2ApplicationTestsContextInitializer.registerAssuntoService(beanFactory);
    org.springframework.boot.autoconfigure.Trabalho2ApplicationTestsContextInitializer.registerAutoConfigurationPackages_BasePackages(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration", PropertyPlaceholderAutoConfiguration.class)
        .instanceSupplier(PropertyPlaceholderAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("propertySourcesPlaceholderConfigurer", PropertySourcesPlaceholderConfigurer.class).withFactoryMethod(PropertyPlaceholderAutoConfiguration.class, "propertySourcesPlaceholderConfigurer")
        .instanceSupplier(() -> PropertyPlaceholderAutoConfiguration.propertySourcesPlaceholderConfigurer()).register(beanFactory);
    org.springframework.boot.autoconfigure.aop.Trabalho2ApplicationTestsContextInitializer.registerAspectJAutoProxyingConfiguration_JdkDynamicAutoProxyConfiguration(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.aop.config.internalAutoProxyCreator", AnnotationAwareAspectJAutoProxyCreator.class)
        .instanceSupplier(AnnotationAwareAspectJAutoProxyCreator::new).customize((bd) -> {
      bd.setRole(2);
      bd.getPropertyValues().addPropertyValue("order", -2147483648);
    }).register(beanFactory);
    org.springframework.boot.autoconfigure.aop.Trabalho2ApplicationTestsContextInitializer.registerAopAutoConfiguration_AspectJAutoProxyingConfiguration(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration", AopAutoConfiguration.class)
        .instanceSupplier(AopAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration", ApplicationAvailabilityAutoConfiguration.class)
        .instanceSupplier(ApplicationAvailabilityAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("applicationAvailability", ApplicationAvailabilityBean.class).withFactoryMethod(ApplicationAvailabilityAutoConfiguration.class, "applicationAvailability")
        .instanceSupplier(() -> beanFactory.getBean(ApplicationAvailabilityAutoConfiguration.class).applicationAvailability()).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration", JtaAutoConfiguration.class)
        .instanceSupplier(JtaAutoConfiguration::new).register(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerDataSourceConfiguration_Hikari(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerHikari_dataSource(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerDataSourceJmxConfiguration_Hikari(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerDataSourceJmxConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerDataSourceAutoConfiguration_PooledDataSourceConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.metadata.Trabalho2ApplicationTestsContextInitializer.registerDataSourcePoolMetadataProvidersConfiguration_HikariPoolDataSourceMetadataProviderConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.metadata.Trabalho2ApplicationTestsContextInitializer.registerHikariPoolDataSourceMetadataProviderConfiguration_hikariPoolDataSourceMetadataProvider(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration", DataSourcePoolMetadataProvidersConfiguration.class)
        .instanceSupplier(DataSourcePoolMetadataProvidersConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration", DataSourceAutoConfiguration.class)
        .instanceSupplier(DataSourceAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor.class)
        .instanceSupplier(ConfigurationPropertiesBindingPostProcessor::new).customize((bd) -> bd.setRole(2)).register(beanFactory);
    org.springframework.boot.context.properties.Trabalho2ApplicationTestsContextInitializer.registerConfigurationPropertiesBinder_Factory(beanFactory);
    org.springframework.boot.context.properties.Trabalho2ApplicationTestsContextInitializer.registerConfigurationPropertiesBinder(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties.class)
        .instanceSupplier(BoundConfigurationProperties::new).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter.class)
        .instanceSupplier(() -> MethodValidationExcludeFilter.byAnnotation(ConfigurationProperties.class)).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties", DataSourceProperties.class)
        .instanceSupplier(DataSourceProperties::new).register(beanFactory);
    org.springframework.boot.autoconfigure.orm.jpa.Trabalho2ApplicationTestsContextInitializer.registerHibernateJpaConfiguration(beanFactory);
    BeanDefinitionRegistrar.of("transactionManager", PlatformTransactionManager.class).withFactoryMethod(JpaBaseConfiguration.class, "transactionManager", ObjectProvider.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(JpaBaseConfiguration.class).transactionManager(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("jpaVendorAdapter", JpaVendorAdapter.class).withFactoryMethod(JpaBaseConfiguration.class, "jpaVendorAdapter")
        .instanceSupplier(() -> beanFactory.getBean(JpaBaseConfiguration.class).jpaVendorAdapter()).register(beanFactory);
    BeanDefinitionRegistrar.of("entityManagerFactoryBuilder", EntityManagerFactoryBuilder.class).withFactoryMethod(JpaBaseConfiguration.class, "entityManagerFactoryBuilder", JpaVendorAdapter.class, ObjectProvider.class, ObjectProvider.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(JpaBaseConfiguration.class).entityManagerFactoryBuilder(attributes.get(0), attributes.get(1), attributes.get(2)))).register(beanFactory);
    BeanDefinitionRegistrar.of("entityManagerFactory", LocalContainerEntityManagerFactoryBean.class).withFactoryMethod(JpaBaseConfiguration.class, "entityManagerFactory", EntityManagerFactoryBuilder.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(JpaBaseConfiguration.class).entityManagerFactory(attributes.get(0)))).customize((bd) -> bd.setPrimary(true)).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.jpa.hibernate-org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties", HibernateProperties.class)
        .instanceSupplier(HibernateProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.jpa-org.springframework.boot.autoconfigure.orm.jpa.JpaProperties", JpaProperties.class)
        .instanceSupplier(JpaProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration", HibernateJpaAutoConfiguration.class)
        .instanceSupplier(HibernateJpaAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration", ConfigurationPropertiesAutoConfiguration.class)
        .instanceSupplier(ConfigurationPropertiesAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration", LifecycleAutoConfiguration.class)
        .instanceSupplier(LifecycleAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("lifecycleProcessor", DefaultLifecycleProcessor.class).withFactoryMethod(LifecycleAutoConfiguration.class, "defaultLifecycleProcessor", LifecycleProperties.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(LifecycleAutoConfiguration.class).defaultLifecycleProcessor(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties", LifecycleProperties.class)
        .instanceSupplier(LifecycleProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration", PersistenceExceptionTranslationAutoConfiguration.class)
        .instanceSupplier(PersistenceExceptionTranslationAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("persistenceExceptionTranslationPostProcessor", PersistenceExceptionTranslationPostProcessor.class).withFactoryMethod(PersistenceExceptionTranslationAutoConfiguration.class, "persistenceExceptionTranslationPostProcessor", Environment.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> PersistenceExceptionTranslationAutoConfiguration.persistenceExceptionTranslationPostProcessor(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration", TaskExecutionAutoConfiguration.class)
        .instanceSupplier(TaskExecutionAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("taskExecutorBuilder", TaskExecutorBuilder.class).withFactoryMethod(TaskExecutionAutoConfiguration.class, "taskExecutorBuilder", TaskExecutionProperties.class, ObjectProvider.class, ObjectProvider.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(TaskExecutionAutoConfiguration.class).taskExecutorBuilder(attributes.get(0), attributes.get(1), attributes.get(2)))).register(beanFactory);
    BeanDefinitionRegistrar.of("applicationTaskExecutor", ThreadPoolTaskExecutor.class).withFactoryMethod(TaskExecutionAutoConfiguration.class, "applicationTaskExecutor", TaskExecutorBuilder.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(TaskExecutionAutoConfiguration.class).applicationTaskExecutor(attributes.get(0)))).customize((bd) -> bd.setLazyInit(true)).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties", TaskExecutionProperties.class)
        .instanceSupplier(TaskExecutionProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration", JpaRepositoriesAutoConfiguration.class)
        .instanceSupplier(JpaRepositoriesAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("emBeanDefinitionRegistrarPostProcessor", EntityManagerBeanDefinitionRegistrarPostProcessor.class)
        .instanceSupplier(EntityManagerBeanDefinitionRegistrarPostProcessor::new).customize((bd) -> bd.setLazyInit(true)).register(beanFactory);
    BeanDefinitionRegistrar.of("jpaMappingContext", JpaMetamodelMappingContextFactoryBean.class)
        .instanceSupplier(JpaMetamodelMappingContextFactoryBean::new).customize((bd) -> bd.setLazyInit(true)).register(beanFactory);
    BeanDefinitionRegistrar.of("jpaContext", DefaultJpaContext.class).withConstructor(Set.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new DefaultJpaContext(attributes.get(0)))).customize((bd) -> bd.setLazyInit(true)).register(beanFactory);
    org.springframework.data.jpa.util.Trabalho2ApplicationTestsContextInitializer.registerJpaMetamodelCacheCleanup(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension", JpaEvaluationContextExtension.class).withConstructor(char.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new JpaEvaluationContextExtension(attributes.get(0)))).customize((bd) -> bd.getConstructorArgumentValues().addIndexedArgumentValue(0, '\\')).register(beanFactory);
    BeanDefinitionRegistrar.of("comentarioRepository", ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, ComentarioRepository.class, ComentarioEntity.class, Long.class)).withConstructor(Class.class)
        .instanceSupplier((instanceContext) -> {
          JpaRepositoryFactoryBean bean = instanceContext.create(beanFactory, (attributes) -> new JpaRepositoryFactoryBean(attributes.get(0)));
          instanceContext.method("setQueryMethodFactory", JpaQueryMethodFactory.class)
              .invoke(beanFactory, (attributes) -> bean.setQueryMethodFactory(attributes.get(0)));
          instanceContext.method("setEntityPathResolver", ObjectProvider.class)
              .invoke(beanFactory, (attributes) -> bean.setEntityPathResolver(attributes.get(0)));
          return bean;
        }).customize((bd) -> {
      bd.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.ufsc.trabalho2.repositories.ComentarioRepository");
      MutablePropertyValues propertyValues = bd.getPropertyValues();
      propertyValues.addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
      propertyValues.addPropertyValue("lazyInit", false);
      propertyValues.addPropertyValue("namedQueries", BeanDefinitionRegistrar.inner(PropertiesBasedNamedQueries.class).withConstructor(Properties.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new PropertiesBasedNamedQueries(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, BeanDefinitionRegistrar.inner(PropertiesFactoryBean.class)
          .instanceSupplier(PropertiesFactoryBean::new).customize((bd__) -> {
        MutablePropertyValues propertyValues__ = bd__.getPropertyValues();
        propertyValues__.addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
        propertyValues__.addPropertyValue("ignoreResourceNotFound", true);
      }).toBeanDefinition())).toBeanDefinition());
      propertyValues.addPropertyValue("repositoryFragments", BeanDefinitionRegistrar.inner(RepositoryFragmentsFactoryBean.class).withConstructor(List.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new RepositoryFragmentsFactoryBean(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList())).toBeanDefinition());
      propertyValues.addPropertyValue("transactionManager", "transactionManager");
      propertyValues.addPropertyValue("entityManager", BeanDefinitionRegistrar.inner(SharedEntityManagerCreator.class).withFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> SharedEntityManagerCreator.createSharedEntityManager(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"))).toBeanDefinition());
      propertyValues.addPropertyValue("escapeCharacter", '\\');
      propertyValues.addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
      propertyValues.addPropertyValue("enableDefaultTransactions", true);
    }).register(beanFactory);
    BeanDefinitionRegistrar.of("postagemRepository", ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, PostagemRepository.class, PostagemEntity.class, Long.class)).withConstructor(Class.class)
        .instanceSupplier((instanceContext) -> {
          JpaRepositoryFactoryBean bean = instanceContext.create(beanFactory, (attributes) -> new JpaRepositoryFactoryBean(attributes.get(0)));
          instanceContext.method("setQueryMethodFactory", JpaQueryMethodFactory.class)
              .invoke(beanFactory, (attributes) -> bean.setQueryMethodFactory(attributes.get(0)));
          instanceContext.method("setEntityPathResolver", ObjectProvider.class)
              .invoke(beanFactory, (attributes) -> bean.setEntityPathResolver(attributes.get(0)));
          return bean;
        }).customize((bd) -> {
      bd.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.ufsc.trabalho2.repositories.PostagemRepository");
      MutablePropertyValues propertyValues = bd.getPropertyValues();
      propertyValues.addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
      propertyValues.addPropertyValue("lazyInit", false);
      propertyValues.addPropertyValue("namedQueries", BeanDefinitionRegistrar.inner(PropertiesBasedNamedQueries.class).withConstructor(Properties.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new PropertiesBasedNamedQueries(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, BeanDefinitionRegistrar.inner(PropertiesFactoryBean.class)
          .instanceSupplier(PropertiesFactoryBean::new).customize((bd__) -> {
        MutablePropertyValues propertyValues__ = bd__.getPropertyValues();
        propertyValues__.addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
        propertyValues__.addPropertyValue("ignoreResourceNotFound", true);
      }).toBeanDefinition())).toBeanDefinition());
      propertyValues.addPropertyValue("repositoryFragments", BeanDefinitionRegistrar.inner(RepositoryFragmentsFactoryBean.class).withConstructor(List.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new RepositoryFragmentsFactoryBean(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList())).toBeanDefinition());
      propertyValues.addPropertyValue("transactionManager", "transactionManager");
      propertyValues.addPropertyValue("entityManager", BeanDefinitionRegistrar.inner(SharedEntityManagerCreator.class).withFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> SharedEntityManagerCreator.createSharedEntityManager(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"))).toBeanDefinition());
      propertyValues.addPropertyValue("escapeCharacter", '\\');
      propertyValues.addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
      propertyValues.addPropertyValue("enableDefaultTransactions", true);
    }).register(beanFactory);
    BeanDefinitionRegistrar.of("editorRepository", ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, EditorRepository.class, EditorEntity.class, Long.class)).withConstructor(Class.class)
        .instanceSupplier((instanceContext) -> {
          JpaRepositoryFactoryBean bean = instanceContext.create(beanFactory, (attributes) -> new JpaRepositoryFactoryBean(attributes.get(0)));
          instanceContext.method("setQueryMethodFactory", JpaQueryMethodFactory.class)
              .invoke(beanFactory, (attributes) -> bean.setQueryMethodFactory(attributes.get(0)));
          instanceContext.method("setEntityPathResolver", ObjectProvider.class)
              .invoke(beanFactory, (attributes) -> bean.setEntityPathResolver(attributes.get(0)));
          return bean;
        }).customize((bd) -> {
      bd.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.ufsc.trabalho2.repositories.EditorRepository");
      MutablePropertyValues propertyValues = bd.getPropertyValues();
      propertyValues.addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
      propertyValues.addPropertyValue("lazyInit", false);
      propertyValues.addPropertyValue("namedQueries", BeanDefinitionRegistrar.inner(PropertiesBasedNamedQueries.class).withConstructor(Properties.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new PropertiesBasedNamedQueries(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, BeanDefinitionRegistrar.inner(PropertiesFactoryBean.class)
          .instanceSupplier(PropertiesFactoryBean::new).customize((bd__) -> {
        MutablePropertyValues propertyValues__ = bd__.getPropertyValues();
        propertyValues__.addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
        propertyValues__.addPropertyValue("ignoreResourceNotFound", true);
      }).toBeanDefinition())).toBeanDefinition());
      propertyValues.addPropertyValue("repositoryFragments", BeanDefinitionRegistrar.inner(RepositoryFragmentsFactoryBean.class).withConstructor(List.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new RepositoryFragmentsFactoryBean(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList())).toBeanDefinition());
      propertyValues.addPropertyValue("transactionManager", "transactionManager");
      propertyValues.addPropertyValue("entityManager", BeanDefinitionRegistrar.inner(SharedEntityManagerCreator.class).withFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> SharedEntityManagerCreator.createSharedEntityManager(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"))).toBeanDefinition());
      propertyValues.addPropertyValue("escapeCharacter", '\\');
      propertyValues.addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
      propertyValues.addPropertyValue("enableDefaultTransactions", true);
    }).register(beanFactory);
    BeanDefinitionRegistrar.of("assuntoRepository", ResolvableType.forClassWithGenerics(JpaRepositoryFactoryBean.class, AssuntoRepository.class, AssuntoEntity.class, Long.class)).withConstructor(Class.class)
        .instanceSupplier((instanceContext) -> {
          JpaRepositoryFactoryBean bean = instanceContext.create(beanFactory, (attributes) -> new JpaRepositoryFactoryBean(attributes.get(0)));
          instanceContext.method("setQueryMethodFactory", JpaQueryMethodFactory.class)
              .invoke(beanFactory, (attributes) -> bean.setQueryMethodFactory(attributes.get(0)));
          instanceContext.method("setEntityPathResolver", ObjectProvider.class)
              .invoke(beanFactory, (attributes) -> bean.setEntityPathResolver(attributes.get(0)));
          return bean;
        }).customize((bd) -> {
      bd.getConstructorArgumentValues().addIndexedArgumentValue(0, "com.ufsc.trabalho2.repositories.AssuntoRepository");
      MutablePropertyValues propertyValues = bd.getPropertyValues();
      propertyValues.addPropertyValue("queryLookupStrategyKey", QueryLookupStrategy.Key.CREATE_IF_NOT_FOUND);
      propertyValues.addPropertyValue("lazyInit", false);
      propertyValues.addPropertyValue("namedQueries", BeanDefinitionRegistrar.inner(PropertiesBasedNamedQueries.class).withConstructor(Properties.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new PropertiesBasedNamedQueries(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, BeanDefinitionRegistrar.inner(PropertiesFactoryBean.class)
          .instanceSupplier(PropertiesFactoryBean::new).customize((bd__) -> {
        MutablePropertyValues propertyValues__ = bd__.getPropertyValues();
        propertyValues__.addPropertyValue("locations", "classpath*:META-INF/jpa-named-queries.properties");
        propertyValues__.addPropertyValue("ignoreResourceNotFound", true);
      }).toBeanDefinition())).toBeanDefinition());
      propertyValues.addPropertyValue("repositoryFragments", BeanDefinitionRegistrar.inner(RepositoryFragmentsFactoryBean.class).withConstructor(List.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new RepositoryFragmentsFactoryBean(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, Collections.emptyList())).toBeanDefinition());
      propertyValues.addPropertyValue("transactionManager", "transactionManager");
      propertyValues.addPropertyValue("entityManager", BeanDefinitionRegistrar.inner(SharedEntityManagerCreator.class).withFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
          .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> SharedEntityManagerCreator.createSharedEntityManager(attributes.get(0)))).customize((bd_) -> bd_.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"))).toBeanDefinition());
      propertyValues.addPropertyValue("escapeCharacter", '\\');
      propertyValues.addPropertyValue("mappingContext", new RuntimeBeanReference("jpaMappingContext"));
      propertyValues.addPropertyValue("enableDefaultTransactions", true);
    }).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration", ProjectInfoAutoConfiguration.class).withConstructor(ProjectInfoProperties.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> new ProjectInfoAutoConfiguration(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties", ProjectInfoProperties.class)
        .instanceSupplier(ProjectInfoProperties::new).register(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerJdbcTemplateConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerJdbcTemplateConfiguration_jdbcTemplate(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerNamedParameterJdbcTemplateConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerNamedParameterJdbcTemplateConfiguration_namedParameterJdbcTemplate(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration", JdbcTemplateAutoConfiguration.class)
        .instanceSupplier(JdbcTemplateAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.jdbc-org.springframework.boot.autoconfigure.jdbc.JdbcProperties", JdbcProperties.class)
        .instanceSupplier(JdbcProperties::new).register(beanFactory);
    org.springframework.boot.sql.init.dependency.Trabalho2ApplicationTestsContextInitializer.registerDatabaseInitializationDependencyConfigurer_DependsOnDatabaseInitializationPostProcessor(beanFactory);
    org.springframework.boot.autoconfigure.sql.init.Trabalho2ApplicationTestsContextInitializer.registerDataSourceInitializationConfiguration(beanFactory);
    org.springframework.boot.autoconfigure.sql.init.Trabalho2ApplicationTestsContextInitializer.registerDataSourceInitializationConfiguration_dataSourceScriptDatabaseInitializer(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration.class)
        .instanceSupplier(SqlInitializationAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties.class)
        .instanceSupplier(SqlInitializationProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration", TaskSchedulingAutoConfiguration.class)
        .instanceSupplier(TaskSchedulingAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("scheduledBeanLazyInitializationExcludeFilter", LazyInitializationExcludeFilter.class).withFactoryMethod(TaskSchedulingAutoConfiguration.class, "scheduledBeanLazyInitializationExcludeFilter")
        .instanceSupplier(() -> TaskSchedulingAutoConfiguration.scheduledBeanLazyInitializationExcludeFilter()).register(beanFactory);
    BeanDefinitionRegistrar.of("taskSchedulerBuilder", TaskSchedulerBuilder.class).withFactoryMethod(TaskSchedulingAutoConfiguration.class, "taskSchedulerBuilder", TaskSchedulingProperties.class, ObjectProvider.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(TaskSchedulingAutoConfiguration.class).taskSchedulerBuilder(attributes.get(0), attributes.get(1)))).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties", TaskSchedulingProperties.class)
        .instanceSupplier(TaskSchedulingProperties::new).register(beanFactory);
    org.springframework.boot.autoconfigure.jdbc.Trabalho2ApplicationTestsContextInitializer.registerDataSourceTransactionManagerAutoConfiguration_JdbcTransactionManagerConfiguration(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration", DataSourceTransactionManagerAutoConfiguration.class)
        .instanceSupplier(DataSourceTransactionManagerAutoConfiguration::new).register(beanFactory);
    org.springframework.transaction.annotation.Trabalho2ApplicationTestsContextInitializer.registerProxyTransactionManagementConfiguration(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.transaction.config.internalTransactionAdvisor", BeanFactoryTransactionAttributeSourceAdvisor.class).withFactoryMethod(ProxyTransactionManagementConfiguration.class, "transactionAdvisor", TransactionAttributeSource.class, TransactionInterceptor.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(ProxyTransactionManagementConfiguration.class).transactionAdvisor(attributes.get(0), attributes.get(1)))).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("transactionAttributeSource", TransactionAttributeSource.class).withFactoryMethod(ProxyTransactionManagementConfiguration.class, "transactionAttributeSource")
        .instanceSupplier(() -> beanFactory.getBean(ProxyTransactionManagementConfiguration.class).transactionAttributeSource()).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("transactionInterceptor", TransactionInterceptor.class).withFactoryMethod(ProxyTransactionManagementConfiguration.class, "transactionInterceptor", TransactionAttributeSource.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(ProxyTransactionManagementConfiguration.class).transactionInterceptor(attributes.get(0)))).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.transaction.config.internalTransactionalEventListenerFactory", TransactionalEventListenerFactory.class).withFactoryMethod(AbstractTransactionManagementConfiguration.class, "transactionalEventListenerFactory")
        .instanceSupplier(() -> AbstractTransactionManagementConfiguration.transactionalEventListenerFactory()).customize((bd) -> bd.setRole(2)).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$JdkDynamicAutoProxyConfiguration", TransactionAutoConfiguration.EnableTransactionManagementConfiguration.JdkDynamicAutoProxyConfiguration.class)
        .instanceSupplier(TransactionAutoConfiguration.EnableTransactionManagementConfiguration.JdkDynamicAutoProxyConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration", TransactionAutoConfiguration.EnableTransactionManagementConfiguration.class)
        .instanceSupplier(TransactionAutoConfiguration.EnableTransactionManagementConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$TransactionTemplateConfiguration", TransactionAutoConfiguration.TransactionTemplateConfiguration.class)
        .instanceSupplier(TransactionAutoConfiguration.TransactionTemplateConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("transactionTemplate", TransactionTemplate.class).withFactoryMethod(TransactionAutoConfiguration.TransactionTemplateConfiguration.class, "transactionTemplate", PlatformTransactionManager.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(TransactionAutoConfiguration.TransactionTemplateConfiguration.class).transactionTemplate(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration", TransactionAutoConfiguration.class)
        .instanceSupplier(TransactionAutoConfiguration::new).register(beanFactory);
    BeanDefinitionRegistrar.of("platformTransactionManagerCustomizers", TransactionManagerCustomizers.class).withFactoryMethod(TransactionAutoConfiguration.class, "platformTransactionManagerCustomizers", ObjectProvider.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> beanFactory.getBean(TransactionAutoConfiguration.class).platformTransactionManagerCustomizers(attributes.get(0)))).register(beanFactory);
    BeanDefinitionRegistrar.of("spring.transaction-org.springframework.boot.autoconfigure.transaction.TransactionProperties", TransactionProperties.class)
        .instanceSupplier(TransactionProperties::new).register(beanFactory);
    BeanDefinitionRegistrar.of("org.springframework.orm.jpa.SharedEntityManagerCreator#0", EntityManager.class).withFactoryMethod(SharedEntityManagerCreator.class, "createSharedEntityManager", EntityManagerFactory.class)
        .instanceSupplier((instanceContext) -> instanceContext.create(beanFactory, (attributes) -> SharedEntityManagerCreator.createSharedEntityManager(attributes.get(0)))).customize((bd) -> {
      bd.setPrimary(true);
      bd.setLazyInit(true);
      bd.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("entityManagerFactory"));
    }).register(beanFactory);
  }
}
