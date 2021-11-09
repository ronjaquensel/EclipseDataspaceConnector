# Architecture <!-- {docsify-ignore-all} -->

---

**Please note**: Work in progress. All content reflects the current state of discussion, not final decisions.

---

Architectural highlights (explained [here](architecture/highlights.md) in more detail):

* Based on a simple modularity system
* Separate control and data planes
* System is asynchronous and highly available
* Transfer processes are fully auditable
* Eliminate single points of failure
* Cloud aware policy enforcement and projection
* System security

## Runtime and Extensions
TBD

### How write custom extension
TBD

## Configuration

Each EDC extension may use its own configuration settings and should explain them in their corresponding README.md.

For a more detailed explanation of the configuration itself please see [configuration.md](configuration.md).

## Data Transfer

### Contract

Before each data transfer a contract must be offered from the provider. A consumer must negotiate an offer successfully,
before its able to request data.

These two processes (offering & negotiation) are documented in the [contracts.md](contracts.md)
