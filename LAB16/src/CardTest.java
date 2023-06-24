import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CardTest {
    int belowRankRange, betweenRankRange, aboveRankRange;

    @Before
    public void init(){
        belowRankRange = 0;
        betweenRankRange = 7;
        aboveRankRange = 14;

    }

    @Test
    public void setRankTest(){

        Card _card = new Card(belowRankRange, Card.SuitType.HEARTS);

        assertEquals("Below Rank Range test failed", _card.getRank(), 1);


    }

    @Test
    public void setRankTest2(){

        Card _card = new Card(betweenRankRange, Card.SuitType.HEARTS);

        assertEquals("Below Rank Range test failed", _card.getRank(), betweenRankRange);
    }

    @Test
    public void setRankTest3(){

        Card _card = new Card(aboveRankRange, Card.SuitType.HEARTS);

        assertEquals("Below Rank Range test failed", _card.getRank(), 1);

    }

}
