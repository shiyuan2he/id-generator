package org.hsy.id.generator;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.stream.IntStream;

/**
 * @author heshiyuan
 * @date 2020/7/27 16:10
 */
@Slf4j
public class IdHelperTest {

    @Test
    public void nextId() {
        IntStream.range(1, 200).forEach(count -> log.info("{}", IdHelper.nextId()));
    }

    @Test
    public void stringIdToLongId() {
    }
}