# Bachelor Thesis: Enhancing Terminal Usability — Replication Package

This repository contains the replication artifacts for the bachelor thesis on enhancing terminal usability with an AI Terminal Assistant.

## Repository Layout

- **`theia/`** — The repository containing the state of the AI Terminal Assistant as used during the survey.
- **`programming-exercise/`** — The programming exercise used during the survey.

## Reproducing the Survey Environment

1. Open a terminal and `cd` into the `theia/` folder.
2. Install dependencies:
   ```bash
   npm install
   ```
3. Build the browser application:
   ```bash
   npm run build browser
   ```
4. Start the browser application:
   ```bash
   npm run start browser
   ```
5. In the running application:
   1. Click on **Terminal**.
   2. Click on **New AI Terminal Assistant** to open the AI Terminal Assistant.

## Running the Programming Exercise

The programming exercise (Java code) is located in the `programming-exercise/` folder and ships with two predefined tasks:

- **Run Task** — builds and runs the code.
- **Build Task** — only builds the code.

To execute a task:

1. Click on **Terminal**.
2. Click on **Run Task**.
3. Choose the desired task (Run or Build).

When you execute the **Run Task**, the program will prompt you for input. After entering any value, the program triggers a stack overflow error. The AI Terminal Assistant will then summarize this error.
