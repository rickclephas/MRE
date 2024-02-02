//
//  iosAppTests.swift
//  iosAppTests
//
//  Created by Rick Clephas on 02/02/2024.
//  Copyright © 2024 orgName. All rights reserved.
//

import XCTest
import shared

final class iosAppTests: XCTestCase {

    func testSwitchPropertyToFalseA() throws {
        let a = ImplA()
        XCTAssertTrue(a.property.boolValue)
        a.property = false
        XCTAssertFalse(a.property.boolValue)
    }
    
    func testSwitchPropertyToFalseAInLoop() throws {
        let a = ImplA()
        XCTAssertTrue(a.property.boolValue)
        while a.property.boolValue {
            a.property = false
        }
        XCTAssertFalse(a.property.boolValue)
    }
    
    
    func testSwitchPropertyToFalseB() throws {
        let b = ImplB()
        XCTAssertTrue(b.property.boolValue)
        b.property = false
        XCTAssertFalse(b.property.boolValue)
    }
}
