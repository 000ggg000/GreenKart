package lt.techin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListPageTest extends BasePageTest {


@Test
    void filterItems(){
    ListPage listPage = new ListPage(driver);
    listPage.sortItems();
}
}
