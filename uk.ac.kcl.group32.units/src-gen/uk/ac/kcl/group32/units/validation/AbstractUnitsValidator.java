/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.group32.units.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUnitsValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.group32.units.units.UnitsPackage.eINSTANCE);
		return result;
	}
}
