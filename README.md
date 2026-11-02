# DigitalAssetManagement
Java project demonstrating interfaces and inheritance for digital assets

# Digital Asset Management

A simple Java project that demonstrates how interfaces, abstract classes, inheritance, constructors, encapsulation, and method overriding can be used to model digital assets in an object-oriented design.

## Project Purpose

This project is a learning example for organizing related asset types under a common parent class while allowing each type to define its own behavior. It models digital assets as Java objects and shows how a shared interface and abstract base class can provide a consistent structure across different asset kinds.

## Core Classes and Roles

- `Processable` is an interface that declares the `process()` method. In this project, `process()` is used as a demonstration method that prints a message to the console, showing that the asset can be processed in a generic way.
- `DigitalAsset` is an abstract class that implements `Processable` and stores shared asset information such as the asset name, file size, and file format.
- `Model3D` extends `DigitalAsset` and adds a polygon count for 3D models.
- `Image2D` extends `DigitalAsset` and adds width and height values for 2D images.
- `AudioAsset` extends `DigitalAsset` and adds audio duration information.
- `ProjectDemo` creates example asset objects and prints their information to demonstrate the class hierarchy and the behavior of each asset type.

## How It Works

The program creates sample objects for:
- a 3D model,
- a 2D image,
- an audio asset.

Each object inherits common fields and methods from `DigitalAsset`, while also defining its own specific properties. The `process()` method in the classes is intended only as a demonstration of polymorphism and inheritance; it prints a message to the console and does not modify or process actual 3D, image, or audio files.

## How to Run in NetBeans

1. Open the project in NetBeans.
2. Build the project to ensure all Java classes compile.
3. Run the `ProjectDemo` class.
4. Observe the console output, which displays sample information for each digital asset type.

The program prints demonstration messages for each asset and shows how the object structure works. It does not perform real media processing or edit actual files.

## Concepts Demonstrated

- `implements` with an interface
- `extends` with an abstract parent class
- Constructors and `super()`
- Encapsulation with getters and setters
- Method overriding for `process()` and `toString()`

This project uses sample data only and is intended to illustrate object-oriented programming concepts rather than to manipulate real media files.
