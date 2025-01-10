package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ZombieListTest {

    @Test
    public void testFilterOrgans() {

        GoogleZombieConnector mockConnector = mock(GoogleZombieConnector.class);


        when(mockConnector.findBodies("region1")).thenReturn(
                Arrays.asList("ZombieType1_Bio1", "ZombieType2_Bio2", "ZombieType1_Bio3", "AlienType1_Bio4")
        );

        ZombieList zombieList = new ZombieList(mockConnector);

        List<String> filtered = zombieList.filterOrgans("region1", "ZombieType1");

        Assert.assertEquals(2, filtered.size());
        Assert.assertEquals("ZombieType1_Bio1", filtered.get(0));
        Assert.assertEquals("ZombieType1_Bio3", filtered.get(1));

        Mockito.verify(mockConnector).findBodies("region1");
    }
}
