import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
/*
实现Python中的eval()
 */
public class StringExp {
    public static void main(String[] args) {
        /**
         *
         <dependency>
         <groupId>org.apache.commons</groupId>
         <artifactId>commons-jexl3</artifactId>
         <version>3.1</version>
         </dependency>
         */
        String expressionString = "((100 + 3)*4 + 12/4)/5";
        JexlEngine jexlEngine = new JexlBuilder().create();
        JexlExpression jexlExpression = jexlEngine.createExpression(expressionString);
        Object evaluate = jexlExpression.evaluate(null);
        System.out.println(evaluate);
    }
}
