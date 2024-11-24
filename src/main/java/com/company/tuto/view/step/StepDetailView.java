package com.company.tuto.view.step;

import com.company.tuto.entity.Step;
import com.company.tuto.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "steps/:id", layout = MainView.class)
@ViewController("UU1_Step.detail")
@ViewDescriptor("step-detail-view.xml")
@EditedEntityContainer("stepDc")
public class StepDetailView extends StandardDetailView<Step> {
}