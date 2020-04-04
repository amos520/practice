package com.example.practice.jdk.stream;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 */
public class StreamApiTest {
    public static final ArrayList<Account> list = new ArrayList<>();

    @BeforeClass
    public  static void initData(){

        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            double v = random.nextDouble()* 100000;
            list.add(new Account(i, "amos" + i, new BigDecimal(v)));
        }
        System.out.println("Account size :"+list.size());
        System.out.println("人员初始化完成。。。");
    }

    /**
     * 性能测试例子
     */
    @Test
    public void forEach() {
        System.out.println("forEach start..." );
        long start = System.currentTimeMillis();

        BigDecimal decimal = new BigDecimal(BigDecimal.ROUND_UP);
        for (Account account : list) {
//            decimal = decimal.add(account.getAmount());
            System.out.println(account);
        }

        long end = System.currentTimeMillis();
//        System.out.println("forEach total:" + decimal);
        System.out.println("forEach time:" + (double) (end - start) /1000 + "s");
    }

    /**
     * 性能测试例子
     */
    @Test
    public void stream() {
        System.out.println("stream start..." );
        long startStream = System.currentTimeMillis();

//        BigDecimal reduce = list.stream()
//                .map(Account::getAmount)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);

        list.stream()
                .map(Account::getAccountName)
                .forEach(System.out::println);

        long endStream = System.currentTimeMillis();
//        System.out.println("Stream total:" + reduce);
        System.out.println("Stream time:" + (double) (endStream - startStream) /1000 + "s");
    }

    /**
     * 性能测试例子
     */
    @Test
    public void streamParallel() {
        System.out.println("streamParallel start..." );
        long startStream = System.currentTimeMillis();

//        BigDecimal reduce =  list.parallelStream().parallel()
//                .map(Account::getAmount)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);

        list.parallelStream()
                .map(Account::getAccountName)
                .forEach(System.out::println);

        long endStream = System.currentTimeMillis();
//        System.out.println("streamParallel total:" + reduce);
        System.out.println("streamParallel time:" + (double) (endStream - startStream) /1000 + "s");
    }
}