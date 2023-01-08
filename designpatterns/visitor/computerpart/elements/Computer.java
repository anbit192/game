package designpatterns.visitor.computerpart.elements;

import designpatterns.visitor.computerpart.visitors.ComputerPartVisitor;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {

    private List<ComputerPart> computerPart;

    public Computer() {
        computerPart = new ArrayList<>();
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
