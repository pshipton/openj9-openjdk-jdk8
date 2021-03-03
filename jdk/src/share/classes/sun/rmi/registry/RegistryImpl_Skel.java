/*
 * Copyright (c) 2017, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package sun.rmi.registry;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.AccessException;
import java.rmi.server.RemoteCall;

import sun.rmi.transport.Connection;
import sun.rmi.transport.StreamRemoteCall;
import sun.rmi.transport.tcp.TCPConnection;

/**
 * Skeleton to dispatch RegistryImpl methods.
 * Originally generated by RMIC but frozen to match the stubs.
 */
@SuppressWarnings({"deprecation", "serial"})
public final class RegistryImpl_Skel
        implements java.rmi.server.Skeleton {
    private static final java.rmi.server.Operation[] operations = {
            new java.rmi.server.Operation("void bind(java.lang.String, java.rmi.Remote)"),
            new java.rmi.server.Operation("java.lang.String list()[]"),
            new java.rmi.server.Operation("java.rmi.Remote lookup(java.lang.String)"),
            new java.rmi.server.Operation("void rebind(java.lang.String, java.rmi.Remote)"),
            new java.rmi.server.Operation("void unbind(java.lang.String)")
    };

    private static final long interfaceHash = 4905912898345647071L;

    public java.rmi.server.Operation[] getOperations() {
        return operations.clone();
    }

    public void dispatch(java.rmi.Remote obj, java.rmi.server.RemoteCall call, int opnum, long hash)
            throws java.lang.Exception {
        if (hash != interfaceHash)
            throw new java.rmi.server.SkeletonMismatchException("interface hash mismatch");

        sun.rmi.registry.RegistryImpl server = (sun.rmi.registry.RegistryImpl) obj;
        switch (opnum) {
            case 0: // bind(String, Remote)
            {
                // Check access before reading the arguments
                RegistryImpl.checkAccess("Registry.bind");

                java.lang.String $param_String_1;
                java.rmi.Remote $param_Remote_2;
                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $param_String_1 = (java.lang.String) in.readObject();
                    $param_Remote_2 = (java.rmi.Remote) in.readObject();
                } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
                } finally {
                    call.releaseInputStream();
                }
                server.bind($param_String_1, $param_Remote_2);
                try {
                    call.getResultStream(true);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling return", e);
                }
                break;
            }

            case 1: // list()
            {
                call.releaseInputStream();
                java.lang.String[] $result = server.list();
                try {
                    java.io.ObjectOutput out = call.getResultStream(true);
                    out.writeObject($result);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling return", e);
                }
                break;
            }

            case 2: // lookup(String)
            {
                java.lang.String $param_String_1;
                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $param_String_1 = (java.lang.String) in.readObject();
                } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
                } finally {
                    call.releaseInputStream();
                }
                java.rmi.Remote $result = server.lookup($param_String_1);
                try {
                    java.io.ObjectOutput out = call.getResultStream(true);
                    out.writeObject($result);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling return", e);
                }
                break;
            }

            case 3: // rebind(String, Remote)
            {
                // Check access before reading the arguments
                RegistryImpl.checkAccess("Registry.rebind");

                java.lang.String $param_String_1;
                java.rmi.Remote $param_Remote_2;
                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $param_String_1 = (java.lang.String) in.readObject();
                    $param_Remote_2 = (java.rmi.Remote) in.readObject();
                } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
                } finally {
                    call.releaseInputStream();
                }
                server.rebind($param_String_1, $param_Remote_2);
                try {
                    call.getResultStream(true);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling return", e);
                }
                break;
            }

            case 4: // unbind(String)
            {
                // Check access before reading the arguments
                RegistryImpl.checkAccess("Registry.unbind");

                java.lang.String $param_String_1;
                try {
                    java.io.ObjectInput in = call.getInputStream();
                    $param_String_1 = (java.lang.String) in.readObject();
                } catch (java.io.IOException | java.lang.ClassNotFoundException e) {
                    throw new java.rmi.UnmarshalException("error unmarshalling arguments", e);
                } finally {
                    call.releaseInputStream();
                }
                server.unbind($param_String_1);
                try {
                    call.getResultStream(true);
                } catch (java.io.IOException e) {
                    throw new java.rmi.MarshalException("error marshalling return", e);
                }
                break;
            }

            default:
                throw new java.rmi.UnmarshalException("invalid method number");
        }
    }
}
