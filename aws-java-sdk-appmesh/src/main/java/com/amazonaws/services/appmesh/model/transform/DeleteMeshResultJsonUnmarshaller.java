/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteMeshResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMeshResultJsonUnmarshaller implements Unmarshaller<DeleteMeshResult, JsonUnmarshallerContext> {

    public DeleteMeshResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteMeshResult deleteMeshResult = new DeleteMeshResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteMeshResult;
        }

        while (true) {
            if (token == null)
                break;

            deleteMeshResult.setMesh(MeshDataJsonUnmarshaller.getInstance().unmarshall(context));
            token = context.nextToken();
        }

        return deleteMeshResult;
    }

    private static DeleteMeshResultJsonUnmarshaller instance;

    public static DeleteMeshResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteMeshResultJsonUnmarshaller();
        return instance;
    }
}
