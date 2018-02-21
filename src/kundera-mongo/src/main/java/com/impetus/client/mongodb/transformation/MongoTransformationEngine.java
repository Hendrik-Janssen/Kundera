package com.impetus.client.mongodb.transformation;

import com.impetus.kundera.transformation.ModelTransformationEngine;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.m2m.atl.emftvm.EmftvmFactory;
import org.eclipse.m2m.atl.emftvm.Metamodel;

public class MongoTransformationEngine implements ModelTransformationEngine{

	@Override
	public Object transform(Object entity) {
		Metamodel sourceMetaModel = transformEntityClassToMetaModel( entity.getClass() );
		return null;
	}

	private Metamodel transformEntityClassToMetaModel(Class entityClass) {
		Metamodel metamodel = EmftvmFactory.eINSTANCE.createMetamodel();
		EcoreFactory.eINSTANCE.createEClass();
		//EFactory factory = new EFactoryImpl();
		EObject eObject = EPackageImpl.
		return null;
	}
}
