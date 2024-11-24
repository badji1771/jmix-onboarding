package com.company.tuto.view.department;

import com.company.tuto.entity.Department;
import com.company.tuto.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "departments/:id", layout = MainView.class)
@ViewController("UU1_Department.detail")
@ViewDescriptor("department-detail-view.xml")
@EditedEntityContainer("departmentDc")
public class DepartmentDetailView extends StandardDetailView<Department> {
}