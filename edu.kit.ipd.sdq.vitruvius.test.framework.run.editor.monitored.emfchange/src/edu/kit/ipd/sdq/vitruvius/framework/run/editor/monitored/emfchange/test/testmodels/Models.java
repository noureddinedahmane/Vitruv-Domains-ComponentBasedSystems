/*******************************************************************************
 * Copyright (c) 2014 Felix Kutzner.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Felix Kutzner - initial implementation.
 ******************************************************************************/

package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.testmodels;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.net.URL;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.testmodels.pcm.PCMTestUtils;

public class Models {
    private static Logger LOGGER = Logger.getLogger(Models.class);

    public static final String ROOT_OBJECT_URI = "/";

    static {
        LOGGER.setLevel(Level.ALL);
    }

    private static void setupURIPathmaps() {
        URIConverter.URI_MAP.put(URI.createURI("pathmap://PCM_MODELS/PrimitiveTypes.repository"),
                URI.createURI(PCMTestUtils.class.getResource("PrimitiveTypes.repository").getFile()));
        URIConverter.URI_MAP.put(URI.createURI("pathmap://PCM_MODELS/Palladio.resourcetype"),
                URI.createURI(PCMTestUtils.class.getResource("PrimitiveTypes.repository").getFile()));
        URIConverter.URI_MAP.put(URI.createURI("pathmap://PCM_MODELS/FailureTypes.repository"),
                URI.createURI(PCMTestUtils.class.getResource("PrimitiveTypes.repository").getFile()));
    }

    public static Resource loadModel(URL modelURL) {

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        setupURIPathmaps();

        EcoreResourceFactoryImpl ecoreResFact = new EcoreResourceFactoryImpl();
        URI fileName = URI.createFileURI(modelURL.getFile());
        LOGGER.info("Trying to load " + fileName);
        Resource ecoreRes = ecoreResFact.createResource(fileName);
        try {
            ecoreRes.load(null);
        } catch (IOException e) {
            fail("Could not load " + Files.EXAMPLEMODEL_ECORE.getFile() + ". Reason: " + e);
        }

        resSet.getResources().add(ecoreRes);

        return ecoreRes;
    }

    public static void unloadModel(Resource res) {
        LOGGER.info("Unloading model " + res.getURI().toFileString());
        res.unload();
    }
}
