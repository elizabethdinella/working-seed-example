1) put the files in this repo in the checked out buggy defects4j project
2) open `compile_seed.sh` and update the project_cp. It should include the output of `defects4j export -p cp.compile -w <DIR> / 2>/dev/null` where <DIR> is the full path to your checked out project repo. You should also add path to a junit jar.

3) compile the seed with `bash compile_seed.sh`

4) update the `project_cp` in the `run.sh` to the output of the `defects4j export` command above. 

5) run `bash run.sh`
