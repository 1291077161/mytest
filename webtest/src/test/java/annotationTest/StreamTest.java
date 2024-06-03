package annotationTest;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

@Slf4j
public class StreamTest {
	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(200);

		//
		//String[] message = {"map", "flatMap", "compare"};
		//Stream<String[]> wordSream = Arrays.stream(message).map(ele -> ele.split(""));
		//wordSream.collect(Collectors.toList()).stream().forEach(i -> System.out.println(i.toString()));
		//
		//
		//
		//
		////System.out.println(wordSream.count());
		//
		//
		//Stream<String> characterStream = Arrays.stream(message).flatMap(word -> Arrays.stream(word.split("")));
		//System.out.println(characterStream.count());


		// 模拟一组用户数据
		List<UserInfo> userInfoList = new ArrayList<UserInfo>(20);
		UserInfo userInfo;
		for (int i = 1; i < 10; i++) {
			userInfo = new UserInfo();
			userInfo.setUserUid(i + "");
			userInfo.setUserName("用户" + i);
			userInfo.setAge(i);
			// 性别各一半
			userInfo.setSex((byte) (i % 2));
			userInfoList.add(userInfo);
		}
		// 打印原数据
		//userInfoList.forEach(item -> {
		//	log.info("原数据：{}", item.toString());
		//});

		userInfoList.stream().filter(item->item.getAge()==5).findFirst().ifPresent(item->item.setAge(15));
		userInfoList.stream().filter(item->item.getAge()==5).findFirst().isPresent();


		//userInfoList.stream().collect(Collectors.partitioningBy())

		List<BigDecimal> numberList = new ArrayList<BigDecimal>();
		numberList.add(new BigDecimal(10));
		numberList.add(new BigDecimal(5));
		log.info("BigDecimal的list求和：{}", numberList.stream().reduce((x, y) -> x.add(y)).orElse(BigDecimal.ZERO));
											numberList.stream().reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
		log.info("BigDecimal的list求和：{}", numberList.stream().reduce(BigDecimal.ZERO,new BinaryOperator<BigDecimal>() {
			@Override
			public BigDecimal apply(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
				return bigDecimal.add(bigDecimal2);
			}
		}));
		//Collections.synchronizedMap()


		List<Integer> ls = new ArrayList<>();
		ls.add(4);ls.add(2);ls.add(6);
		int[] ints = ls.stream().sorted().mapToInt(i -> i).toArray();
		Object[] objects = ls.toArray();

		System.out.println("ls.stream().sorted().mapToInt(i -> i).toArray().toString() = " + ls.stream().sorted().mapToInt(i -> i).toArray().toString());


		//userInfoList.forEach(item -> {
		//	log.info("新数据：{}", item.toString());
		//});

		//UserInfo userInfo1 = userInfoList.stream().filter(i -> i.getAge() == 15).findAny().get();
		//System.out.println("userInfo1 = " + userInfo1);


	}
}
