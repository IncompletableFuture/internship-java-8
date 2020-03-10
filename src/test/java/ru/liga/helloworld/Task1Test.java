package ru.liga.helloworld;

import org.junit.Test;
import ru.liga.helloworld.domain.World;
import ru.liga.helloworld.repo.WorldRepository;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {

    /**
     * Аналитик попросил посмотреть есть ли и какие города с именами больше 16 символов (чтобы влезло в GUI на вебе)
     * <p>
     * Вывести все города, имена (без пробелов) которых больше 16 символов, отсортировать по названию
     */
    @Test
    public void test() {
        File file = new File(
                getClass().getClassLoader().getResource("world.sqlite").getFile()
        );

        World world = new WorldRepository(file.getAbsolutePath()).helloWorld();
        List<String> cityList = world.getAllCitiesNamesWithoutWhitespacesMoreTenSymbols();
        System.out.println(cityList);
        assertThat(cityList.size()).isEqualTo(188);
    }

}