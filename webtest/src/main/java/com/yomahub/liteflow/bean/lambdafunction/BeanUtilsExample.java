package com.yomahub.liteflow.bean.lambdafunction;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
public class BeanUtilsExample {

	// public static void copyNonNullPropertiesToNull(Object source, Object destination) {
	// 	// 将目标对象的所有属性值置为空
	// 	setAllPropertiesToNull(destination);
	//
	// 	// 拷贝源对象的非空属性值到目标对象
	// 	BeanUtils.copyProperties(source, destination, getNonNullPropertyNames(source));
	// }
	//
	// private static String[] getNonNullPropertyNames(Object source) {
	// 	final BeanWrapper src = new BeanWrapperImpl(source);
	// 	Set<String> nonNullPropertyNames = new HashSet<>();
	// 	for (PropertyDescriptor pd : src.getPropertyDescriptors()) {
	// 		Object srcValue = src.getPropertyValue(pd.getName());
	// 		if (srcValue != null) {
	// 			nonNullPropertyNames.add(pd.getName());
	// 		}
	// 	}
	// 	String[] result = new String[nonNullPropertyNames.size()];
	// 	return nonNullPropertyNames.toArray(result);
	// }
	//
	// private static void setAllPropertiesToNull(Object obj) {
	// 	BeanWrapper beanWrapper = new BeanWrapperImpl(obj);
	// 	PropertyDescriptor[] propertyDescriptors = beanWrapper.getPropertyDescriptors();
	// 	for (PropertyDescriptor pd : propertyDescriptors) {
	// 		// 这里假设属性的setter方法以set开头
	// 		if (pd.getWriteMethod() != null && !pd.getName().equals("class")) {
	// 			beanWrapper.setPropertyValue(pd.getName(), null);
	// 		}
	// 	}
	// }


	// public static void copyNonNullPropertiesToNull(Object source, Object destination) {
	// 	BeanWrapper srcBeanWrapper = new BeanWrapperImpl(source);
	// 	BeanWrapper destBeanWrapper = new BeanWrapperImpl(destination);
	//
	// 	for (PropertyDescriptor propertyDescriptor : srcBeanWrapper.getPropertyDescriptors()) {
	// 		String propertyName = propertyDescriptor.getName();
	// 		Object srcValue = srcBeanWrapper.getPropertyValue(propertyName);
	// 		Object destValue = destBeanWrapper.getPropertyValue(propertyName);
	//
	// 		// 只有在源对象的属性值非空且目标对象的属性值也非空时，才将目标对象的对应属性值置为空
	// 		if (srcValue != null && destValue != null) {
	// 			destBeanWrapper.setPropertyValue(propertyName, null);
	// 		}
	// 	}
	// }


	// public static void copyNonNullPropertiesToNull(Object source, Object destination) {
	// 	BeanWrapper srcBeanWrapper = new BeanWrapperImpl(source);
	// 	BeanWrapper destBeanWrapper = new BeanWrapperImpl(destination);
	//
	// 	for (PropertyDescriptor propertyDescriptor : srcBeanWrapper.getPropertyDescriptors()) {
	// 		String propertyName = propertyDescriptor.getName();
	//
	// 		// 排除 'class' 属性
	// 		if (propertyName.equals("class")) {
	// 			continue;
	// 		}
	//
	// 		Object srcValue = srcBeanWrapper.getPropertyValue(propertyName);
	// 		Object destValue = destBeanWrapper.getPropertyValue(propertyName);
	//
	// 		// 只有在源对象的属性值非空且目标对象的属性值也非空时，才将目标对象的对应属性值置为空
	// 		if (srcValue != null && destValue != null) {
	// 			destBeanWrapper.setPropertyValue(propertyName, null);
	// 		}
	// 	}
	// }

	//
	// public static void copyNonNullPropertiesToNull(Object source, Object destination) {
	// 	BeanWrapper srcWrapper = new BeanWrapperImpl(source);
	// 	BeanWrapper destWrapper = new BeanWrapperImpl(destination);
	//
	// 	// 获取源对象的属性值，如果非空，则将目标对象对应属性设置为空
	// 	for (PropertyDescriptor propertyDescriptor : srcWrapper.getPropertyDescriptors()) {
	// 		String propertyName = propertyDescriptor.getName();
	// 		if (propertyName.equals("class")) {
	// 			continue;
	// 		}
	// 		Object srcValue = srcWrapper.getPropertyValue(propertyName);
	// 		Object destValue = destWrapper.getPropertyValue(propertyName);
	//
	// 		if (srcValue != null) {
	// 			destWrapper.setPropertyValue(propertyName, null);
	// 		}
	// 	}
	// }


	public static <T> void copyNonNullPropertiesToNull(T source, T destination) {
		Class<?> sourceClass = source.getClass();
		Class<?> destinationClass = destination.getClass();

		// 获取源对象的所有属性
		Field[] fields = sourceClass.getDeclaredFields();
		for (Field field : fields) {
			try {
				// 获取属性名称
				String fieldName = field.getName();
				// 获取源对象的属性值
				field.setAccessible(true);
				Object sourceValue = field.get(source);

				// 获取目标对象相同属性的值
				Field destField = destinationClass.getDeclaredField(fieldName);
				destField.setAccessible(true);
				Object destValue = destField.get(destination);

				// 只有当源对象的属性非空时，将目标对象的对应属性设置为空
				if (sourceValue != null && destValue != null) {
					destField.set(destination, null);
				}
			} catch (Exception e) {
				// 属性不同时不作处理
				log.info("属性的不同的值：{}",e.getMessage());

			}
		}
	}


	// public static void copyNonNullPropertiesToNull(Object source, Object destination) {
	// 	BeanWrapper srcBeanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(source);
	// 	BeanWrapper destBeanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(destination);
	//
	// 	for (PropertyDescriptor propertyDescriptor : srcBeanWrapper.getPropertyDescriptors()) {
	// 		String propertyName = propertyDescriptor.getName();
	// 		Object srcValue = srcBeanWrapper.getPropertyValue(propertyName);
	//
	// 		if (srcValue != null) {
	// 			destBeanWrapper.setPropertyValue(propertyName, null);
	// 		}
	// 	}
	// }


	public static void main(String[] args) {
		Source source = new Source();
		source.setNamea(null);
		source.setAgeb(null);
		source.setAddress("深圳");

		Destination destination = new Destination();
		destination.setName("Doe");
		destination.setAge(25);

		copyNonNullPropertiesToNull(source, destination);
		// copyNonNullPropertiesToNull(source, destination);

		// Destination Name: null
		System.out.println("Destination Name: " + destination.getName());
		// Destination Age: null
		System.out.println("Destination Age: " + destination.getAge());
	}
}

@Data
@Accessors(chain = true)
class Source {
	private String namea;
	private Integer ageb;
	private String address;
	private String country;

	// Getters and setters...
}

@Data
@Accessors(chain = true)
class Destination {
	private String name;
	private Integer age;

	private String habbit;

	// Getters and setters...
}
