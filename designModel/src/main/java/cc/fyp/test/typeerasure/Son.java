package cc.fyp.test.typeerasure;

import org.w3c.dom.Node;

import java.util.List;

/**
 * @author von
 * @description:
 * @date 2020/7/15 17:25
 */
public class Son implements Father<Node> {

    @Override
    public List<Node> getInfo(List<Node> xx) {
        return null;
    }

    @Override
    public List<Node> haha() {
        return null;
    }
}
