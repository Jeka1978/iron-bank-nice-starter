package com.nice.ironbankstarter.ironbanknicestart;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class OnProdCondition implements Condition {
    private static String answer;
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (answer == null) {
            answer= JOptionPane.showInputDialog(null, "is it production?");
        }
        return answer.toLowerCase().contains("yes");
    }
}
