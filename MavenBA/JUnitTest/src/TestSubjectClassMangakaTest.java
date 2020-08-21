import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

class TestSubjectClassMangakaTest {
    private static TestSubjectClassMangaka testSub;

    @BeforeAll
    static void startUp() {
        testSub = new TestSubjectClassMangaka();
    }

    @org.junit.jupiter.api.Test
    void interact() {
       assertEquals(testSub.interact("Hello"),"Thats right, Hello-desu");
    }

}